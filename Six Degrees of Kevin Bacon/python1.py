import sys
from collections import deque, defaultdict

# Read inputs
actor_name = input().strip()
n = int(input().strip())
movies = [input().strip() for _ in range(n)]

# Graph to store actor connections
graph = defaultdict(set)

# Build the graph from movie casts
for movie in movies:
    parts = movie.split(": ")
    movie_title = parts[0]
    actors = parts[1].split(", ")
    for actor in actors:
        for co_actor in actors:
            if actor != co_actor:
                graph[actor].add(co_actor)

# Function to perform BFS and find the shortest path to Kevin Bacon
def bfs(start_actor):
    queue = deque([(start_actor, 0)])  # (actor, degree)
    visited = set()
    visited.add(start_actor)

    while queue:
        current_actor, degree = queue.popleft()

        if current_actor == "Kevin Bacon":
            return degree

        for neighbor in graph[current_actor]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append((neighbor, degree + 1))

# Compute the Bacon number using BFS
bacon_number = bfs(actor_name)
print(bacon_number)