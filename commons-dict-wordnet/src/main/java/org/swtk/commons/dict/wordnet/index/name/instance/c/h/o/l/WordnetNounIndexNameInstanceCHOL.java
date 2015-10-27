package org.swtk.commons.dict.wordnet.index.name.instance.c.h.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cholangiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907838\"]}");
	add("{\"term\":\"cholangitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14364139\"]}");
	add("{\"term\":\"cholecalciferol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15116794\"]}");
	add("{\"term\":\"cholecystectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00670243\"]}");
	add("{\"term\":\"cholecystitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14364227\"]}");
	add("{\"term\":\"cholecystokinin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05416479\"]}");
	add("{\"term\":\"cholelithiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14138727\"]}");
	add("{\"term\":\"cholelithotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00684723\"]}");
	add("{\"term\":\"choler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05414301\", \"07531593\", \"07568195\"]}");
	add("{\"term\":\"cholera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14153061\"]}");
	add("{\"term\":\"cholestasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14077947\"]}");
	add("{\"term\":\"cholesterin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15083111\"]}");
	add("{\"term\":\"cholesterol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15083111\"]}");
	add("{\"term\":\"choline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14834731\"]}");
	add("{\"term\":\"cholinesterase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14760001\"]}");
	add("{\"term\":\"cholla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11872308\"]}");
	add("{\"term\":\"choloepus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02460387\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }