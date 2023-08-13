## url: http://localhost:8080/graphiql?path=/graphql    
mutation{
  addBook(bookInput: {title: "booktt", name: "bookn", authorId: 2}) {
    id
  }

}
## mutation example request

query{
  authors{
    id
    books{name, title}
  }
}

##

query{
  authorById(id: 2){
    name
    books {
      id
      name
      title
    }
  }
}

## query author by id

