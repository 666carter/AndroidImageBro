Fotag(j286zhao) allows user to load image from the certain url, and be able to remove it, or reload again.
Unfortunately I do not have enough time to implement filter functionality.
Other features are all able to run:
1: load button(first button in toolbar)
2: clear button(second button in toolbar)
3: Support horizontal and vertical layouts
4: data & states are saved during orientation changes
5: rate system
6: enlarge image by click it, and close the enlarge-image window by clicking it again



Note: I use Pixel2 API 28 for testing, let "auto-rotate" off, and put app-debug.apk at root directory.
The virtual device's scroll bar sometimes respond slowly, but you can click on the screen to scroll down/up [which is faster and smooth]
And I use android studio for developing project.

(Due to the assignment requirement, I copy the app-debug.apk file to the root directory, and I change my project name one time. However, these causing my program crash for "apk defined multiple times". After research, I find solution: clean/rebuild project, then run. Therefore, it needs to rebuild and then run every time)
