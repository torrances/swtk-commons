package org.swtk.commons.dict.wordnet.indexbyname.instance.g.y.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGYP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gyp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00781071\"]}");
	add("{\"term\":\"gypaetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01619930\"]}");
	add("{\"term\":\"gypaetus barbatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01620084\"]}");
	add("{\"term\":\"gyps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01619611\"]}");
	add("{\"term\":\"gyps fulvus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01619736\"]}");
	add("{\"term\":\"gypsophila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11830659\"]}");
	add("{\"term\":\"gypsophila paniculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11830827\"]}");
	add("{\"term\":\"gypsum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14701939\"]}");
	add("{\"term\":\"gypsum board\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03964056\"]}");
	add("{\"term\":\"gypsy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06982496\", \"09642482\", \"10173755\", \"10237501\"]}");
	add("{\"term\":\"gypsy cab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478060\"]}");
	add("{\"term\":\"gypsy dancing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00534073\"]}");
	add("{\"term\":\"gypsy moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02288741\"]}");
	add("{\"term\":\"gypsy rose lee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11144462\"]}");
	add("{\"term\":\"gypsyweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12912403\"]}");
	add("{\"term\":\"gypsywort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12873330\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }