package org.swtk.commons.dict.wordnet.indexbyname.instance.g.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gimbal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442491\"]}");
	add("{\"term\":\"gimcrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03381284\"]}");
	add("{\"term\":\"gimcrackery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03381284\"]}");
	add("{\"term\":\"gimel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06849979\"]}");
	add("{\"term\":\"gimlet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02761495\", \"07931235\"]}");
	add("{\"term\":\"gimmick\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00172070\", \"03223248\", \"05172200\"]}");
	add("{\"term\":\"gimmickry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07976477\"]}");
	add("{\"term\":\"gimp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14573529\"]}");
	add("{\"term\":\"gimpiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14573529\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }