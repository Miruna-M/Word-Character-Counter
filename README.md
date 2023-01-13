# Word-Character-Counter
Java GUI Word &amp; Character Counter

This is a Java program that uses a GUI built with the Swing library to count the number of Words and the number of Characters in a text inputted by the user.

I used a JTextArea for the user to input text, two JLabels to display the word and character counts, and a JButton to initiate the count. The countButton's ActionListener is used to count the words and characters in the text, which are then displayed on the corresponding JLabels. The countButton can be clicked multiple times to recount the number of words and characters after modifying the inputted text. 

The initial JTextArea has dimensions (10, 120), however, its area expands vertically as more text is inputted. Once the length of the textArea surpasses the height of the JFrame, the program utilizes a JScrollPane to scroll down in order for the text to be fully viewable. As for the horizontal axis of the JTextArea, I implemented a setLineWrap in order to assure that all of the user-inputted text is visible at all times.

GUI Example Screenshot:
![image](https://user-images.githubusercontent.com/117134870/212212912-7f47739b-6b70-418e-8eee-0cf472e12a7e.png)

