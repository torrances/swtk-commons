package org.swtk.commons.dict.wordnet.index.name.instance.m.i.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMINU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"minuartia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11832827\"]}");
	add("{\"term\":\"minuend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13751141\"]}");
	add("{\"term\":\"minuet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07070153\", \"00537815\"]}");
	add("{\"term\":\"minuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11201428\"]}");
	add("{\"term\":\"minus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00873540\"]}");
	add("{\"term\":\"minuscule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06361999\", \"06837807\"]}");
	add("{\"term\":\"minute\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05138288\", \"06518306\", \"13632810\", \"15269461\", \"15271664\", \"15259561\"]}");
	add("{\"term\":\"minuteman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03778207\", \"10341290\"]}");
	add("{\"term\":\"minuteness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04810951\", \"05114228\"]}");
	add("{\"term\":\"minutes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06520103\"]}");
	add("{\"term\":\"minutia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05828034\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }