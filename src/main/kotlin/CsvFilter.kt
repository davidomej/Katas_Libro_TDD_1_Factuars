class CsvFilter {
 fun filter(lines: List<String>): List<String>{
     val result = mutableListOf<String>()
     result.add(lines[0])
     val invoice = lines[1]
     val fields = invoice.split(',')
     val ivaFieldIndex = 4
     val igicFieldIndex  =5
     val taxFieldsAreMutuallyExclusive=(fields[ivaFieldIndex].isNullOrEmpty() ||
             fields[igicFieldIndex].isNullOrEmpty()) &&
             (!(fields[ivaFieldIndex].isNullOrEmpty() &&
                     fields[igicFieldIndex].isNullOrEmpty()))
         if(taxFieldsAreMutuallyExclusive){

         result.add(lines[1])
         }
     return result.toList()
 }
}
