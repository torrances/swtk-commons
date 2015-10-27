package org.swtk.commons.dict.wordnet.index.name.instance.h.o.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"holla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136069\"]}");
	add("{\"term\":\"holland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08968866\"]}");
	add("{\"term\":\"hollandaise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07851433\"]}");
	add("{\"term\":\"hollander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09732504\"]}");
	add("{\"term\":\"hollands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07921000\"]}");
	add("{\"term\":\"holler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09327937\", \"07136069\"]}");
	add("{\"term\":\"hollering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136069\"]}");
	add("{\"term\":\"hollerith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11076461\"]}");
	add("{\"term\":\"hollo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136069\"]}");
	add("{\"term\":\"holloa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136069\"]}");
	add("{\"term\":\"hollow\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09327656\", \"09327937\", \"13933910\"]}");
	add("{\"term\":\"holloware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03532329\"]}");
	add("{\"term\":\"hollowness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04875102\", \"05077366\", \"14479000\"]}");
	add("{\"term\":\"hollowware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03532329\"]}");
	add("{\"term\":\"holly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11076649\", \"12777217\"]}");
	add("{\"term\":\"hollygrape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11719911\"]}");
	add("{\"term\":\"hollyhock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12194181\", \"12194828\"]}");
	add("{\"term\":\"hollywood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09086427\", \"14549379\", \"08085433\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }