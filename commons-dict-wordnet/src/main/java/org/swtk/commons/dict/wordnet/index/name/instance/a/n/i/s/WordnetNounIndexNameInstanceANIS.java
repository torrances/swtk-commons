package org.swtk.commons.dict.wordnet.index.name.instance.a.n.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anise\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07842629\", \"12963809\"]}");
	add("{\"term\":\"aniseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07842629\"]}");
	add("{\"term\":\"aniseikonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14120644\"]}");
	add("{\"term\":\"anisette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07924887\"]}");
	add("{\"term\":\"anisogamete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05464777\"]}");
	add("{\"term\":\"anisogamy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13453422\"]}");
	add("{\"term\":\"anisometropia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14579152\"]}");
	add("{\"term\":\"anisoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270986\"]}");
	add("{\"term\":\"anisotremus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02592116\"]}");
	add("{\"term\":\"anisotropy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04924857\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }