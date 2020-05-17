# CS349 A3
Student: j286zhao
Marker: Damien


Total: 78 / 95 (82.11%)

Code:
(CO: won’t compile, CR: crashes, FR: UI freezes/unresponsive, NS: not submitted)


Notes:   

## Deliverables (5%)

1. [5/5] APK was included and can be executed on a Pixel AVD with API 28.

## Basic requirements (10%)

2. [4/4] The application launches a screen, containing an empty image grid and a toolbar.

3. [6/6] There are clear mechanisms to clear the images, load a set of images, and filter the images. These can appear on the main toolbar or a secondary toolbar.

## Screen layout (35%)

4. [10/10] Horizontal Layout shows a fixed number of columns (2 or more), and should contain sufficient rows to display all of the images. No horizontal scrollbar should appear, but there should be a means of scrolling vertically if required to display the data.

5. [10/10] Vertical Layout shows a single column. No horizontal bar should appear. It should support scrolling vertically if required to display data.


6. [5/5] Layout can be automatically switched between landscape and portrait based on phone orientation.

7. [5/5] The ratings widget appears in the grid below each image.

8. [3/5] The interface design is aesthetic (the layout is functional and pleasant, good images were used for the widgets, etc.).

-2 Aspect ratio of images is not conserved

## Images (30%)

9. [10/10] The "load images button" should clear the grid and ratings, load 10 images from the website, and display them in the grid.

10. [5/5] The application should support loading and displaying multiple formats, incling JPG and PNG.

11. [5/5] Images are reasonably sized for the device and orientation. Images should be scaled to be visible, but do NOT need to be scaled to the same size.

12. [5/5] Selecting an image shows an enlarged image. Touching the image should dismiss it.



## Ranking (20%)

14. [5/5] Individual images can be ranked by changing the rating for the image.

15. [0/10] The ratings filter on the toolbar filters out the images that don't meet this rating or higher.

-10 The ratings filter does not work at all

16. [0/5] Changing the rating of an image should immediately be reflected in the list (i.e. if it no longer meets the filter criteria, it should disappear).

-5 Images do not disappear automatically when they do not meet the filter criteria.
