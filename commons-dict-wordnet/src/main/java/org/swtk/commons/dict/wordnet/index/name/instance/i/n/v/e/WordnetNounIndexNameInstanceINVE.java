package org.swtk.commons.dict.wordnet.index.name.instance.i.n.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"invective\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06734353\"]}");
	add("{\"term\":\"invention\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00942228\", \"03587827\", \"05641230\"]}");
	add("{\"term\":\"inventiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05641517\"]}");
	add("{\"term\":\"inventor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10234307\"]}");
	add("{\"term\":\"inventory\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01013367\", \"05641904\", \"13433706\", \"04328672\", \"06504655\"]}");
	add("{\"term\":\"inventorying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01013367\"]}");
	add("{\"term\":\"inverse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13881030\"]}");
	add("{\"term\":\"inversion\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00336479\", \"00336640\", \"00858904\", \"07043661\", \"07115806\", \"07440326\", \"13523408\", \"14127267\", \"11481962\"]}");
	add("{\"term\":\"invertase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14945760\"]}");
	add("{\"term\":\"invertebrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01908302\"]}");
	add("{\"term\":\"inverter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03588128\"]}");
	add("{\"term\":\"investigating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00635107\"]}");
	add("{\"term\":\"investigation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00635107\", \"05808619\"]}");
	add("{\"term\":\"investigator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10028930\", \"10235293\", \"10542669\"]}");
	add("{\"term\":\"investing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01101341\"]}");
	add("{\"term\":\"investiture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00199768\", \"07468248\"]}");
	add("{\"term\":\"investment\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00199768\", \"00830123\", \"01461257\", \"04654542\", \"13354252\", \"01101341\"]}");
	add("{\"term\":\"investor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10235776\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }