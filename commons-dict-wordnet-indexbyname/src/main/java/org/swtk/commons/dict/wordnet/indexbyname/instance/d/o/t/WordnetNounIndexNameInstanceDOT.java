package org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dot\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02678511\", \"06818684\", \"08160653\", \"13934887\"]}");
	add("{\"term\":\"dot com\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08018826\"]}");
	add("{\"term\":\"dot com company\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08018826\"]}");
	add("{\"term\":\"dot matrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08284877\"]}");
	add("{\"term\":\"dot matrix printer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230480\"]}");
	add("{\"term\":\"dot printer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03230480\"]}");
	add("{\"term\":\"dot product\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05873468\"]}");
	add("{\"term\":\"dotage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15179150\"]}");
	add("{\"term\":\"dotard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10046830\"]}");
	add("{\"term\":\"dotrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026839\"]}");
	add("{\"term\":\"dotted gayfeather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12012018\"]}");
	add("{\"term\":\"dotted line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06813202\"]}");
	add("{\"term\":\"dotterel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026839\"]}");
	add("{\"term\":\"dottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14862709\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }