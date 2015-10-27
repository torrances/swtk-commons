package org.swtk.commons.dict.wordnet.index.name.instance.c.h.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06946056\", \"05607372\"]}");
	add("{\"term\":\"china\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03022147\", \"08748383\", \"03021863\", \"08740839\"]}");
	add("{\"term\":\"chinaberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12716736\", \"12762552\"]}");
	add("{\"term\":\"chinaman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00477963\", \"09717733\"]}");
	add("{\"term\":\"chinaware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03022147\"]}");
	add("{\"term\":\"chincapin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07788389\"]}");
	add("{\"term\":\"chinch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02243169\"]}");
	add("{\"term\":\"chincherinchee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12480813\"]}");
	add("{\"term\":\"chinchilla\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02370144\", \"03022268\", \"14788894\"]}");
	add("{\"term\":\"chinchillidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02369783\"]}");
	add("{\"term\":\"chinchillon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370768\"]}");
	add("{\"term\":\"chinchona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12684565\"]}");
	add("{\"term\":\"chine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01897769\", \"07670147\"]}");
	add("{\"term\":\"chinese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09717504\", \"06942519\"]}");
	add("{\"term\":\"chingpo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945962\"]}");
	add("{\"term\":\"chink\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07393823\", \"09266675\", \"09717733\"]}");
	add("{\"term\":\"chinkapin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07788389\"]}");
	add("{\"term\":\"chino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03022958\"]}");
	add("{\"term\":\"chinoiserie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03023218\"]}");
	add("{\"term\":\"chinook\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02539087\", \"06937773\", \"07812297\", \"09672240\", \"11458726\"]}");
	add("{\"term\":\"chinookan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06937773\"]}");
	add("{\"term\":\"chinos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03023088\"]}");
	add("{\"term\":\"chinquapin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07788389\", \"12284255\", \"12284504\"]}");
	add("{\"term\":\"chintz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03023621\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }