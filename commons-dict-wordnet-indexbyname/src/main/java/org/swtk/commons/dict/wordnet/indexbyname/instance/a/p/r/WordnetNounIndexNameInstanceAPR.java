package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"apr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15235985\"]}");
	add("{\"term\":\"apraxia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14114608\"]}");
	add("{\"term\":\"apresoline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03555851\"]}");
	add("{\"term\":\"apricot\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04978942\", \"07766848\", \"12661368\"]}");
	add("{\"term\":\"apricot bar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07653558\"]}");
	add("{\"term\":\"apricot sauce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07848283\"]}");
	add("{\"term\":\"apricot tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12661368\"]}");
	add("{\"term\":\"april\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15235985\"]}");
	add("{\"term\":\"april fool\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00515367\", \"09820698\"]}");
	add("{\"term\":\"apron\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02734128\", \"04019738\", \"08513344\", \"02733935\"]}");
	add("{\"term\":\"apron string\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02734256\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }