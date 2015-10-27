package org.swtk.commons.dict.wordnet.index.name.instance.a.s.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASSE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"assegai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02752675\"]}");
	add("{\"term\":\"assemblage\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07968050\", \"01232427\", \"03538666\", \"07991473\"]}");
	add("{\"term\":\"assembler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06585513\"]}");
	add("{\"term\":\"assembling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01016008\"]}");
	add("{\"term\":\"assembly\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01232427\", \"02752958\", \"08180691\", \"03391266\", \"00913832\", \"02752795\"]}");
	add("{\"term\":\"assemblyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09833786\"]}");
	add("{\"term\":\"assemblywoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09833893\"]}");
	add("{\"term\":\"assent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07190226\"]}");
	add("{\"term\":\"assenter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09833972\"]}");
	add("{\"term\":\"assenting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07191852\"]}");
	add("{\"term\":\"asserter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834065\"]}");
	add("{\"term\":\"assertion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07217786\", \"06742248\"]}");
	add("{\"term\":\"assertiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05174764\"]}");
	add("{\"term\":\"assessee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834481\"]}");
	add("{\"term\":\"assessment\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00875745\", \"05153302\", \"13424319\", \"05741528\"]}");
	add("{\"term\":\"assessor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10712379\"]}");
	add("{\"term\":\"asset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05161764\"]}");
	add("{\"term\":\"assets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13350663\"]}");
	add("{\"term\":\"asseveration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06742248\"]}");
	add("{\"term\":\"asseverator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834065\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }