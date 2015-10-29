package org.swtk.commons.dict.wordnet.indexbyname.instance.o.z.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOZO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ozocerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14689281\"]}");
	add("{\"term\":\"ozokerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14689281\"]}");
	add("{\"term\":\"ozone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14997366\"]}");
	add("{\"term\":\"ozone hole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09405463\"]}");
	add("{\"term\":\"ozone layer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09405619\"]}");
	add("{\"term\":\"ozone sickness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213766\"]}");
	add("{\"term\":\"ozonide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14708588\"]}");
	add("{\"term\":\"ozonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13103471\"]}");
	add("{\"term\":\"ozonosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09405619\"]}");
	add("{\"term\":\"ozothamnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12019924\"]}");
	add("{\"term\":\"ozothamnus secundiflorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12020125\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }