package org.swtk.commons.dict.wordnet.index.name.instance.m.a.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMATE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mate\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00168585\", \"07943025\", \"10319821\", \"12778428\", \"13765240\", \"03734302\", \"10660018\", \"10319970\", \"10714546\", \"10319708\"]}");
	add("{\"term\":\"matelote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07607384\"]}");
	add("{\"term\":\"mater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10320167\"]}");
	add("{\"term\":\"materfamilias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10322243\"]}");
	add("{\"term\":\"material\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10320321\", \"03735442\", \"03314753\", \"06648034\", \"14604877\"]}");
	add("{\"term\":\"materialisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07309665\", \"07337624\", \"13533239\"]}");
	add("{\"term\":\"materialism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05981452\", \"14062792\"]}");
	add("{\"term\":\"materialist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10320496\", \"10320630\"]}");
	add("{\"term\":\"materiality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04768026\", \"13816870\"]}");
	add("{\"term\":\"materialization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07309665\", \"07337624\", \"13533239\"]}");
	add("{\"term\":\"materiel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03735644\"]}");
	add("{\"term\":\"maternalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00656783\", \"04880153\"]}");
	add("{\"term\":\"maternity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04880153\", \"13836253\", \"14069684\"]}");
	add("{\"term\":\"mates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08005299\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }