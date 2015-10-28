package org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bicarbonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14799888\"]}");
	add("{\"term\":\"bicentenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276411\"]}");
	add("{\"term\":\"bicentennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276411\"]}");
	add("{\"term\":\"biceps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05586870\"]}");
	add("{\"term\":\"bichloride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15041910\"]}");
	add("{\"term\":\"bichromate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15038331\"]}");
	add("{\"term\":\"bicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199395\"]}");
	add("{\"term\":\"bickering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199395\"]}");
	add("{\"term\":\"bicorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837847\"]}");
	add("{\"term\":\"bicorne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837847\"]}");
	add("{\"term\":\"bicuspid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05314857\"]}");
	add("{\"term\":\"bicycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837983\"]}");
	add("{\"term\":\"bicycler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005719\"]}");
	add("{\"term\":\"bicycling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00452549\"]}");
	add("{\"term\":\"bicyclist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005719\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }