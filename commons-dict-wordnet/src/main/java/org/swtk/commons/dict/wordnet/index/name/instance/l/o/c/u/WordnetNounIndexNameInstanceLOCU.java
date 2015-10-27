package org.swtk.commons.dict.wordnet.index.name.instance.l.o.c.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOCU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"locule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05261415\"]}");
	add("{\"term\":\"loculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05261415\"]}");
	add("{\"term\":\"locum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10288986\"]}");
	add("{\"term\":\"locus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08017323\", \"08641143\", \"08695366\"]}");
	add("{\"term\":\"locust\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12515651\", \"12515901\", \"02229622\"]}");
	add("{\"term\":\"locusta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02229771\"]}");
	add("{\"term\":\"locustidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02229250\"]}");
	add("{\"term\":\"locution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07166088\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }