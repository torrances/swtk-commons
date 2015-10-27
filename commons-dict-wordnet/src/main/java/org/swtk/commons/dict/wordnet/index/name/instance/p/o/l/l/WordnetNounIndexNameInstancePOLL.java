package org.swtk.commons.dict.wordnet.index.name.instance.p.o.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poll\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00655054\", \"01819987\", \"05546645\", \"05547228\", \"05809006\"]}");
	add("{\"term\":\"pollachius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02526712\"]}");
	add("{\"term\":\"pollack\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02526833\", \"07805216\", \"11260986\"]}");
	add("{\"term\":\"pollard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01321830\", \"13129082\"]}");
	add("{\"term\":\"pollen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11695988\"]}");
	add("{\"term\":\"pollenation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07451972\"]}");
	add("{\"term\":\"pollex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05574850\"]}");
	add("{\"term\":\"pollination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07451972\"]}");
	add("{\"term\":\"pollinator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02164109\"]}");
	add("{\"term\":\"pollinium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11696189\"]}");
	add("{\"term\":\"pollinosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14557801\"]}");
	add("{\"term\":\"polliwog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02472103\"]}");
	add("{\"term\":\"pollock\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02526833\", \"07805216\", \"11261096\"]}");
	add("{\"term\":\"polls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08638968\"]}");
	add("{\"term\":\"pollster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10471164\"]}");
	add("{\"term\":\"pollucite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14715246\"]}");
	add("{\"term\":\"pollutant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14881429\"]}");
	add("{\"term\":\"polluter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10471414\"]}");
	add("{\"term\":\"pollution\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00277831\", \"14521988\", \"14540345\"]}");
	add("{\"term\":\"pollux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09420025\"]}");
	add("{\"term\":\"pollyfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02613294\"]}");
	add("{\"term\":\"pollywog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02472103\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }