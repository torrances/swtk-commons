package org.swtk.commons.dict.wiktionary.generated.e.o.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEOS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eosin", "{\"term\":\"eosin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A red, acidic dye commonly used in histological stains\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, Dan J. Goldstein, \u0027Understanding the Light Microscope\u0027, [http://books.google.com.au/books?id\u003dbCQnuWyUm8gC\u0026amp;pg\u003dPA91\u0026amp;dq\u003d%22eosin%22%7C%22eosins%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d-tYVU7rrI4mVkwWmp4DoAg\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22eosin%22%7C%22eosins%22\u0026amp;f\u003dfalse page 91\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Thus the fluorescence of the familiar dye \u0027\u0027eosin\u0027\u0027 can be excited quite well by ultra-violet or short-wave blue light, but is much better excited by visible green light with a wavelength close to that of the emitted radiation\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, J. Ochei, A. Kolhatkar, \u0027Medical Laboratory Science: Theory And Practice\u0027, [http://books.google.com.au/books?id\u003dlciNs3VQPLoC\u0026amp;pg\u003dPA450\u0026amp;dq\u003d%22eosin%22%7C%22eosins%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d-tYVU7rrI4mVkwWmp4DoAg\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22eosin%22%7C%22eosins%22\u0026amp;f\u003dfalse page 450\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Eosins\u0027\u0027 are acid xanthene or phthalein dyes. \u0027\u0027Eosin\u0027\u0027 Y, \u0027\u0027eosin\u0027\u0027 B, phloxine and erythrosin (which unlike other \u0027\u0027eosins\u0027\u0027, is halogenated with iodine), are the common members of this group of dyes\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, John D. Bancroft, Christopher Layton, \u002710: The hemotoxylins and \u0027\u0027eosin\u0027\u0027\u0027, S. Kim Suvarna, Christopher Layton, John D. Bancroft (editors), \u0027Bancroft\u0027s Theory and Practice of Histological Techniques\u0027, 7th Edition, [http://books.google.com.au/books?id\u003dFoOn7il3yqcC\u0026amp;pg\u003dPA173\u0026amp;dq\u003d%22eosin%22%7C%22eosins%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d-tYVU7rrI4mVkwWmp4DoAg\u0026amp;redir_esc\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22eosin%22%7C%22eosins%22\u0026amp;f\u003dfalse page 173\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"The hematoxylin and \u0027\u0027eosin\u0027\u0027 stain (H\u0026amp;E) is the most widely used histological stain\", \"priority\":10}]}, \"synonyms\":{}}");

	add("eosinophil", "{\"term\":\"eosinophil\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A white blood cell responsible for combating infection by parasites in the body\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }