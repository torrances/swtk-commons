package org.swtk.commons.dict.wordnet.indexbyname.instance.v.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vienna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08865316\"]}");
	add("{\"term\":\"vienna roll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07707503\"]}");
	add("{\"term\":\"vienna sausage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07692600\"]}");
	add("{\"term\":\"vienne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08333678\", \"08958801\"]}");
	add("{\"term\":\"vientiane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08976837\"]}");
	add("{\"term\":\"vieques\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08771394\"]}");
	add("{\"term\":\"viet nam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09185985\"]}");
	add("{\"term\":\"vietnam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01312298\", \"09185985\"]}");
	add("{\"term\":\"vietnam war\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01312298\"]}");
	add("{\"term\":\"vietnamese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06950006\", \"09766522\"]}");
	add("{\"term\":\"vietnamese monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13696864\"]}");
	add("{\"term\":\"view\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"04682218\", \"05135047\", \"04151847\", \"05992348\", \"06794876\", \"05954491\", \"08578489\", \"00883327\", \"05941982\", \"06218486\"]}");
	add("{\"term\":\"view angle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13942092\"]}");
	add("{\"term\":\"view finder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03345668\"]}");
	add("{\"term\":\"viewer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04541946\", \"10652848\"]}");
	add("{\"term\":\"viewers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08239671\"]}");
	add("{\"term\":\"viewfinder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03345668\"]}");
	add("{\"term\":\"viewgraph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04542074\"]}");
	add("{\"term\":\"viewing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01031915\", \"06901395\"]}");
	add("{\"term\":\"viewing audience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08239671\"]}");
	add("{\"term\":\"viewpoint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08694988\", \"06220098\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }