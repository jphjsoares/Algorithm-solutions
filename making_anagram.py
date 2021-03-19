#!/bin/python3

def makeAnagram(a, b):
    
    for i in s1:
        if i in s2:
            #if it exists, remove it from each string
            #the leftover length will be the number of deletions needed
            s1=s1.replace(i,"",1)
            s2=s2.replace(i,"",1)
    
    return(len(s1)+len(s2))

#TESTS
print(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke")==30)
print(makeAnagram("cde","abc")==4)
print(makeAnagram("showman","woman")==2)