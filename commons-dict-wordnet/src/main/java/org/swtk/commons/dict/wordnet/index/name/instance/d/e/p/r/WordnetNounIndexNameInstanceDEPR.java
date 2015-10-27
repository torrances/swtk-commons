package org.swtk.commons.dict.wordnet.index.name.instance.d.e.p.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEPR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"depravation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04858227\"]}");
	add("{\"term\":\"depravity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00748164\", \"04858227\"]}");
	add("{\"term\":\"deprecation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01222641\", \"07204592\"]}");
	add("{\"term\":\"depreciation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06730109\", \"13349379\", \"00365426\"]}");
	add("{\"term\":\"depreciator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10029325\"]}");
	add("{\"term\":\"depredation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07349476\", \"00969414\"]}");
	add("{\"term\":\"depressant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04173614\"]}");
	add("{\"term\":\"depression\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00113494\", \"13858914\", \"13919062\", \"14412645\", \"14544431\", \"15319454\", \"07552873\", \"09388914\", \"14512697\", \"14427564\"]}");
	add("{\"term\":\"depressive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10024825\"]}");
	add("{\"term\":\"depressor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03182374\", \"05484244\", \"05560100\"]}");
	add("{\"term\":\"deprivation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01152695\", \"05170512\", \"14517010\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }