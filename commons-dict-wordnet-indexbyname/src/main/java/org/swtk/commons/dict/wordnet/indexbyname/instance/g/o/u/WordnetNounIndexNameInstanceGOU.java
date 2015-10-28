package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gouache\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03454047\", \"03454161\"]}");
	add("{\"term\":\"gouda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07869624\"]}");
	add("{\"term\":\"goudy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11029111\"]}");
	add("{\"term\":\"gouge\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00944716\", \"03454253\", \"04700732\"]}");
	add("{\"term\":\"gouger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09974494\", \"10159571\"]}");
	add("{\"term\":\"goujon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02522778\"]}");
	add("{\"term\":\"goulash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07605891\"]}");
	add("{\"term\":\"gould\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11029269\", \"11029491\"]}");
	add("{\"term\":\"gounod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11029631\"]}");
	add("{\"term\":\"gourd\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12178286\", \"12178548\", \"03454395\"]}");
	add("{\"term\":\"gourde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13701378\"]}");
	add("{\"term\":\"gourmand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152508\"]}");
	add("{\"term\":\"gourmandism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05219532\"]}");
	add("{\"term\":\"gourmandizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152508\"]}");
	add("{\"term\":\"gourmet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081464\"]}");
	add("{\"term\":\"gout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14212286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }