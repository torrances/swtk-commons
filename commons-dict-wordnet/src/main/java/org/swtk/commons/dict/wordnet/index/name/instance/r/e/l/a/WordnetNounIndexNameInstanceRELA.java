package org.swtk.commons.dict.wordnet.index.name.instance.r.e.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRELA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"relafen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03809588\"]}");
	add("{\"term\":\"relapse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00069153\"]}");
	add("{\"term\":\"relapsing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00069153\"]}");
	add("{\"term\":\"relatedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13817701\"]}");
	add("{\"term\":\"relation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00041700\", \"05966295\", \"07237483\", \"10255246\", \"00847184\", \"00032220\"]}");
	add("{\"term\":\"relations\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13802661\"]}");
	add("{\"term\":\"relationship\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13834819\", \"13951701\", \"13951421\", \"13802931\"]}");
	add("{\"term\":\"relative\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01330943\", \"10255246\"]}");
	add("{\"term\":\"relativism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05984713\"]}");
	add("{\"term\":\"relativity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05219877\", \"06116109\"]}");
	add("{\"term\":\"relatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06615719\"]}");
	add("{\"term\":\"relaxant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04079923\"]}");
	add("{\"term\":\"relaxation\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00356517\", \"00875476\", \"01066072\", \"07457810\", \"07531213\", \"13570514\", \"13570691\"]}");
	add("{\"term\":\"relaxer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09429921\"]}");
	add("{\"term\":\"relaxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05419396\"]}");
	add("{\"term\":\"relay\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04080072\", \"07479040\", \"08001975\", \"08235886\", \"00319393\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }