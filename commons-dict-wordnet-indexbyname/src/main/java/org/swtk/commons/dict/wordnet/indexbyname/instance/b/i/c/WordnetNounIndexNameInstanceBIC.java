package org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bicameral script\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06838913\"]}");
	add("{\"term\":\"bicarbonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14799888\"]}");
	add("{\"term\":\"bicarbonate of soda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14800154\"]}");
	add("{\"term\":\"bicentenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276411\"]}");
	add("{\"term\":\"bicentennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15276411\"]}");
	add("{\"term\":\"biceps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05586870\"]}");
	add("{\"term\":\"biceps brachii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05587067\"]}");
	add("{\"term\":\"biceps humeri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05587067\"]}");
	add("{\"term\":\"bichloride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15041910\"]}");
	add("{\"term\":\"bichloride of mercury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14974833\"]}");
	add("{\"term\":\"bichromate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15038331\"]}");
	add("{\"term\":\"bicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199395\"]}");
	add("{\"term\":\"bickering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199395\"]}");
	add("{\"term\":\"bicolor lespediza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12563691\"]}");
	add("{\"term\":\"bicorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837847\"]}");
	add("{\"term\":\"bicorne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837847\"]}");
	add("{\"term\":\"bicuspid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05314857\"]}");
	add("{\"term\":\"bicuspid valve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05401156\"]}");
	add("{\"term\":\"bicycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837983\"]}");
	add("{\"term\":\"bicycle chain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02838617\"]}");
	add("{\"term\":\"bicycle clip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02838756\"]}");
	add("{\"term\":\"bicycle pump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02838929\"]}");
	add("{\"term\":\"bicycle race\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07474040\"]}");
	add("{\"term\":\"bicycle rack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02839034\"]}");
	add("{\"term\":\"bicycle seat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02839120\"]}");
	add("{\"term\":\"bicycle traffic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08443168\"]}");
	add("{\"term\":\"bicycle wheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02839240\"]}");
	add("{\"term\":\"bicycler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005719\"]}");
	add("{\"term\":\"bicycling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00452549\"]}");
	add("{\"term\":\"bicyclist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005719\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }