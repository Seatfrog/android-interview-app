# Seatfrog Android Engineer Interview Task 

## App

The app we have created is a _very_ simple Compose based app used to fetch and display a list of railcards. 
We will update this app as part of a pair programming exercise as the first part of the Android Engineer interview. 

| Loading  | Content |
| ------------- | ------------- |
| ![Screenshot_1677153235](https://user-images.githubusercontent.com/1217873/220898695-c2e3d647-54da-407a-b54e-b9f77ef34e00.png)  | ![Screenshot_1677153224](https://user-images.githubusercontent.com/1217873/220898700-cb476004-2c8e-4139-b974-5edcc1fffe02.png)  |

## Tasks

We would like to update the APi to fetch from the network as it is currently returning a small hard coded subset of data. Given the time constraints we are also happy for the JSON to be loaded from the local copy if that is easier / quicker (though would be interested in a discussion on how you would normally setup the network stack)

We would also like to update the model used to represent the railcards from a `String` to something which can contain the code, name and is popular flag. Using this we can update the UI to show all this information (we are not concerned about beautiful UI here, more about how we manage the data and get it to the screen than specific formatting)

Finally we would like to hear general suggestions / comments on how the code / structure / architecture could be improved (again given time constraints we don't expect to go through the process of making these changes)
## Testing 

We dont expect unit tests to be written in the short time we have (though if you have time thats great!), but we would like to discuss as we go how the code could be made (more) testable. 

## Constraints

This is a pairing exercise where we are interested in both your Android knowledge as well as your ability to communicate with other engineers. It is _not_ a memory test so feel free to google / look up docs etc as you would normally. 
