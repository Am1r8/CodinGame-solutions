open System

let t = (Console.In.ReadLine()).Split [|' '|]
let  LX = int(t.[0])
let  LY = int(t.[1])
let mutable TX = int(t.[2])
let mutable TY = int(t.[3])

while true do
    let rt = int(Console.In.ReadLine())
    if (TY > LY) then
       printf("N")
       TY <- TY - 1
    elif (TY < LY) then
       printf("S")
       TY <- TY + 1
    if (TX > LX) then
       printf("W")
       TX <- TX - 1
    elif (TX < LX) then
       printf("E")
       TX <- TX + 1
    printfn("")