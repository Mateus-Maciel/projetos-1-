from tkinter import *
from PyDictionary import PyDictionary

root=Tk()
root.geometry("250x200")


def find_meaning():
    word=enrty.get()
    dictionary=PyDictionary(word)
    meaning=dictionary.printMeanings()
    print(meaning)
    



enrty=Entry(root,font=("times",15,"bold"))
enrty.grid(row=2,column=2)
btn=Button(root,text="find meaning",command=find_meaning)
btn.grid(row=4,column=2)

root.mainloop()