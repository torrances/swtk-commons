package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"state\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08154738\", \"08562388\", \"14011983\", \"14503199\", \"08185877\", \"08195465\", \"00024900\", \"08671935\"]}");
	add("{\"term\":\"statecraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04898060\"]}");
	add("{\"term\":\"statehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04312348\"]}");
	add("{\"term\":\"stateliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04737242\", \"04919071\"]}");
	add("{\"term\":\"statement\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06528586\", \"06597067\", \"07217786\", \"06736201\", \"07043306\", \"06661469\", \"06735202\"]}");
	add("{\"term\":\"stater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10669262\", \"13414328\"]}");
	add("{\"term\":\"stateroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04312710\"]}");
	add("{\"term\":\"statesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10669601\"]}");
	add("{\"term\":\"statesmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04898060\"]}");
	add("{\"term\":\"stateswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10671950\"]}");
	add("{\"term\":\"static\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06725564\", \"07446283\"]}");
	add("{\"term\":\"statice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12119859\"]}");
	add("{\"term\":\"statics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06122908\"]}");
	add("{\"term\":\"statin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03681501\"]}");
	add("{\"term\":\"station\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05064212\", \"08641960\", \"08674221\", \"13970825\", \"04313218\"]}");
	add("{\"term\":\"stationariness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14029975\"]}");
	add("{\"term\":\"stationer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10672142\"]}");
	add("{\"term\":\"stationery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06269505\"]}");
	add("{\"term\":\"stationmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10672276\"]}");
	add("{\"term\":\"stations\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01045365\"]}");
	add("{\"term\":\"statistic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06030848\"]}");
	add("{\"term\":\"statistician\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10672393\", \"10672677\"]}");
	add("{\"term\":\"statistics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06027814\"]}");
	add("{\"term\":\"stator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04313730\"]}");
	add("{\"term\":\"statuary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07975341\"]}");
	add("{\"term\":\"statue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04313985\"]}");
	add("{\"term\":\"statuette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03341404\"]}");
	add("{\"term\":\"stature\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05009517\", \"14461442\"]}");
	add("{\"term\":\"status\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13943868\", \"13968971\"]}");
	add("{\"term\":\"statute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06576378\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }