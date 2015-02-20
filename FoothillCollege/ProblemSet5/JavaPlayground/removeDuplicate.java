public int removeDuplicates()
   {
       int duplicates = 0;
       for ( int i = 0; i < strings.size(); i++ )
       {
           for ( int j = 0; j < strings.size(); j++ )
           {
               if ( i == j )
               {
                   //if i equals j the entry is the same and doesn't need to be removed.
                   // so i use an if statement that tests if i == j.
                   // if i does equal j then do nothing.
                   // is there a better way to do this?
               }
                
               else if ( strings.get( i ).equals( strings.get( j ) ) )
               {
                   duplicates++;
                   strings.remove( j );
                   numbers.remove( j );
               }
           }
       }
        
       return duplicates;
