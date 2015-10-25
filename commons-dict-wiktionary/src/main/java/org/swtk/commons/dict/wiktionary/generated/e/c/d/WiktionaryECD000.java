package org.swtk.commons.dict.wiktionary.generated.e.c.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryECD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ecdysiast", "{\"term\":\"ecdysiast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Coined by w:H. L. Mencken|H. L. Mencken from \u0027\u0027 (on the model of \u0027\u0027 etc.).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An erotic dancer who removes their clothes as a form of entertainment; a stripper\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1973\u0027\u0027, Kyril Bonfiglioli, \u0027Don\u0027t Point That Thing at Me\u0027, Penguin 2001, p. 79\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I had never seen an \u0027\u0027ecdysiast\u0027\u0027 before; toward the end she was wearing nothing but seven beads, four of them sweat\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Chrysti the Wordsmith, \u0027Verbivore\u0027s Feast: A Banquet of Word and Phrase Origins\u0027, Farcountry Press, p. 107\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"However, the Queen of \u0027\u0027Ecdysiasts\u0027\u0027, Gypsy Rose Lee, was not amused. In a 1940 interview, she leveled her guns against Mencken: \u0026quot;\u0027\u0027Ecdysiast\u0027\u0027, he calls me! Why, the man... has been reading books! Dictionaries! We don\u0027t wear feathers and molt them off... What does he know about stripping?\u0026quot\", \"priority\":5}]}, \"synonyms\":{}}");

	add("ecdysiophilia", "{\"term\":\"ecdysiophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The love of watching people strip\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }