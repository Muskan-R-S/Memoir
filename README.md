# Memoir
Simple blog web app


# MEMOIR

## Tasks for the Day

    - To view individual posts we need a separate HTML Page which displays the same post card ( Here we could add the comment and likes features) 
    - For this page we will need a new Method in the controller something like "/posts/{id}" , here the ID field could be the posts ID. 
    - You'll need to read about Path Variable and Request parameters. Refer to this Link `https://www.baeldung.com/spring-requestparam-vs-pathvariable`
    - After knowing both you could decide on which kind you want to use ( I'd suggest using the formaer) 
    - On clicking any post on the Home page, you need to navigate them to the above URL ( if you are wondering how you'll get the id of the post in HTML, remember that we have the entire post in the html with the help of which we are displaying the post title and content ) 
    - Decide on how to achieve the clicking part. ( A quick suggestion is wrapping the entire post with anchor tags and setting the href attributes accordingly )
    - In the controller you should be able to get the post id using the parameters and then query the database using your repository methods (something like get post by ID) 
    - After querying the data should be given to the `posts.html` and that data should be used to display the post related data using thyme leaf templating.
