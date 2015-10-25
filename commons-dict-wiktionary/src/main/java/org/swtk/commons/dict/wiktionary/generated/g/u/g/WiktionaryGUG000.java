package org.swtk.commons.dict.wiktionary.generated.g.u.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("guggul", "{\"term\":\"guggul\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a flowering plant most common in northern India, with thin papery bark and thorny branches; resin extracted from the plant, used in traditional medicine\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, James B. Lavalle, \u0027Cracking the Metabolic Code: The Nine Keys to Peak Health\u0027, [http://books.google.com.au/books?id\u003dzzDE_fraj8IC\u0026amp;pg\u003dPA115\u0026amp;dq\u003d%22guggul%22%7C%22gugguls%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003ddzMcU4vNBMWRkAW2jICQAQ\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22guggul%22%7C%22gugguls%22\u0026amp;f\u003dfalse page 115\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The Hindu medical system of India has used \u0027\u0027guggul\u0027\u0027 for centuries to treat many illnesses. \u0027\u0027Guggul\u0027\u0027 has been described in Indian medical literature as an agent for treating obesity and other eating disorders\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Sandeep Kumar, S. S. Suri, K. C. Sonie, K. G. Ramawat, \u0027Development of Biotechnology for Commiphora wightii: A Potent Source of Natural Hypolipidemic and Hypocholesterolemic Drug\u0027, P. S. Srivastava, Sheela Srivastava, Alka Narula (editors), \u0027Plant Biotechnology and Molecular Markers\u0027, [http://books.google.com.au/books?id\u003dcxY0mfvTePcC\u0026amp;pg\u003dPA132\u0026amp;dq\u003d%22guggul%22%7C%22gugguls%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003ddzMcU4vNBMWRkAW2jICQAQ\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22guggul%22%7C%22gugguls%22\u0026amp;f\u003dfalse page 132\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"In ancient times, \u0027\u0027guggul\u0027\u0027 was used primarily as treatment for inflammatory conditions, including arthritis\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Rajarajeswari Sivalenka, Mangathayaru Putrevu, \u0027Chapter 15: Ayurvedic Ingredients in Cosmetics\u0027, Nava Dayan, Lambros Kromidas (editors), \u0027Formulating, Packaging, and Marketing of Natural Cosmetic Products\u0027, [http://books.google.com.au/books?id\u003dVat73WaVnmoC\u0026amp;pg\u003dPA298\u0026amp;dq\u003d%22guggul%22%7C%22gugguls%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003ddzMcU4vNBMWRkAW2jICQAQ\u0026amp;redir_esc\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22guggul%22%7C%22gugguls%22\u0026amp;f\u003dfalse page 298\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Guggul\u0027\u0027, the sticky gum resin from the Mukul myrrh tree, plays a major role in the traditional herbal medicine of India. The primary chemical constituents of \u0027\u0027guggul\u0027\u0027 include phytosterols, gugulipids, and guggulsterones\", \"priority\":10}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }