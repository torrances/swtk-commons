package org.swtk.commons.dict.wordnet.index.name.instance.a.d.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06708498\"]}");
	add("{\"term\":\"adulator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10115638\"]}");
	add("{\"term\":\"adult\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01323947\", \"09628463\"]}");
	add("{\"term\":\"adulterant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641117\"]}");
	add("{\"term\":\"adulteration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00164451\", \"14511027\"]}");
	add("{\"term\":\"adulterator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09792029\", \"14641117\"]}");
	add("{\"term\":\"adulterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09792169\"]}");
	add("{\"term\":\"adulteress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09792353\"]}");
	add("{\"term\":\"adultery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00850096\"]}");
	add("{\"term\":\"adulthood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14448507\", \"15177777\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }