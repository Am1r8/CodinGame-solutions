using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

class Solution
{
    static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int Q = int.Parse(Console.ReadLine());
            Dictionary <string, string> fileExtention = new Dictionary<string, string>();
            List<string> fileName = new List<string>();
            for (int i = 0; i < N; i++)
            {
                string[] inputs = Console.ReadLine().Split(' ');
                string EXT = inputs[0].ToLower();
                string MT = inputs[1];
                fileExtention.Add(EXT, MT);
            }
            for (int i = 0; i < Q; i++)
            {
                string FNAME = Console.ReadLine();
                FNAME = FNAME.ToLower();
                if (FNAME.Contains('.'))
                {
                     FNAME = FNAME.Substring(FNAME.LastIndexOf('.')+1);
                }
                else
                {
                    FNAME = "N/A";
                }
                fileName.Add(FNAME);
            }
             
            foreach(string extention in fileName)
            {
                if(extention == "N/A")
                {
                    Console.WriteLine("UNKNOWN");
                }
                else if (fileExtention.ContainsKey(extention))
                {
                    string MIMETypeToReturn = string.Empty;
                    fileExtention.TryGetValue(extention, out MIMETypeToReturn);
                    Console.WriteLine(MIMETypeToReturn);
                }
                else
                {
                    Console.WriteLine("UNKNOWN");
                }
            }  
        }
}