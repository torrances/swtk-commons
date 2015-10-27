package org.swtk.commons.dict.wordnet.index.name.instance.b.o.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bounce\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07365001\", \"00121022\", \"05028147\"]}");
	add("{\"term\":\"bouncer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09888415\"]}");
	add("{\"term\":\"bounciness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05028147\"]}");
	add("{\"term\":\"bouncing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07365001\"]}");
	add("{\"term\":\"bound\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00121022\", \"05131322\", \"08529331\", \"13926085\"]}");
	add("{\"term\":\"boundary\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05131322\", \"13926085\", \"08529331\"]}");
	add("{\"term\":\"boundedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216927\"]}");
	add("{\"term\":\"bounder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09888577\", \"09905672\"]}");
	add("{\"term\":\"boundlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216592\"]}");
	add("{\"term\":\"bounds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08529331\"]}");
	add("{\"term\":\"bounteousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04839475\"]}");
	add("{\"term\":\"bountifulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05122718\"]}");
	add("{\"term\":\"bounty\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02882125\", \"04839475\", \"05122718\", \"13293082\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }