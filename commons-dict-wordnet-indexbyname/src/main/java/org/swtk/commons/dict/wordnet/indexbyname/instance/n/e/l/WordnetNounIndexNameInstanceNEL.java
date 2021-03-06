package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nelfinavir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03823370\"]}");
	add("{\"term\":\"nell gwynn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040884\"]}");
	add("{\"term\":\"nell gwynne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040884\"]}");
	add("{\"term\":\"nell gywn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040884\"]}");
	add("{\"term\":\"nellie bly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11310643\"]}");
	add("{\"term\":\"nellie ross\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11290762\"]}");
	add("{\"term\":\"nellie tayloe ross\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11290762\"]}");
	add("{\"term\":\"nelson\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00814997\", \"11223049\"]}");
	add("{\"term\":\"nelson algren\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10833315\"]}");
	add("{\"term\":\"nelson mandela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173190\"]}");
	add("{\"term\":\"nelson rolihlahla mandela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173190\"]}");
	add("{\"term\":\"nelumbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11737708\"]}");
	add("{\"term\":\"nelumbo lutea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11738046\"]}");
	add("{\"term\":\"nelumbo nucifera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11737868\"]}");
	add("{\"term\":\"nelumbonaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11737476\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }