package org.swtk.commons.dict.wordnet.index.name.instance.o.p.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"opera\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03855334\", \"06584114\", \"07039821\"]}");
	add("{\"term\":\"operagoer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10397912\"]}");
	add("{\"term\":\"operand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05865930\"]}");
	add("{\"term\":\"operation\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00410032\", \"00871261\", \"05709328\", \"13546752\", \"00578105\", \"00672594\", \"00957171\", \"13546128\", \"00410304\", \"01097871\", \"14032291\"]}");
	add("{\"term\":\"operationalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05983230\"]}");
	add("{\"term\":\"operations\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01109631\"]}");
	add("{\"term\":\"operative\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10496256\", \"10588855\"]}");
	add("{\"term\":\"operator\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10398651\", \"10214185\", \"10398479\", \"10398111\", \"13808625\"]}");
	add("{\"term\":\"operculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01905009\"]}");
	add("{\"term\":\"operetta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07040577\"]}");
	add("{\"term\":\"operon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05447783\"]}");
	add("{\"term\":\"operoseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04717220\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }