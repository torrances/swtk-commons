package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"paregmenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07119578\"]}");
	add("{\"term\":\"paregoric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03895671\"]}");
	add("{\"term\":\"parenchyma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13117076\", \"05276118\"]}");
	add("{\"term\":\"parent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00006150\", \"10419190\"]}");
	add("{\"term\":\"parentage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08118903\", \"13835977\", \"14448818\"]}");
	add("{\"term\":\"parenthesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06613037\", \"06856443\"]}");
	add("{\"term\":\"parenthetical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06326866\"]}");
	add("{\"term\":\"parenthood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14448818\"]}");
	add("{\"term\":\"parer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03895790\", \"10419594\"]}");
	add("{\"term\":\"paresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14582191\"]}");
	add("{\"term\":\"paresthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14348204\"]}");
	add("{\"term\":\"paretic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10419702\"]}");
	add("{\"term\":\"pareto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11242447\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }