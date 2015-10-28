package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13928578\"]}");
	add("{\"term\":\"saga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06382145\"]}");
	add("{\"term\":\"sagaciousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04897556\", \"05621958\"]}");
	add("{\"term\":\"sagacity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04897556\", \"05621958\"]}");
	add("{\"term\":\"sagamore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10564497\"]}");
	add("{\"term\":\"sage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12885305\", \"07836473\", \"10565759\"]}");
	add("{\"term\":\"sagebrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11949496\"]}");
	add("{\"term\":\"sagina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11834528\"]}");
	add("{\"term\":\"saginaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09124353\"]}");
	add("{\"term\":\"sagitta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01926950\", \"09441832\"]}");
	add("{\"term\":\"sagittaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12633171\"]}");
	add("{\"term\":\"sagittariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01620861\"]}");
	add("{\"term\":\"sagittarius\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01620997\", \"08705263\", \"09441990\", \"09772679\"]}");
	add("{\"term\":\"sago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15079174\"]}");
	add("{\"term\":\"saguaro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11864840\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }