package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crap\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06623729\", \"14878732\"]}");
	add("{\"term\":\"crapaud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01646537\"]}");
	add("{\"term\":\"crape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03135214\", \"07656747\"]}");
	add("{\"term\":\"crapette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00497771\"]}");
	add("{\"term\":\"crapper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04453655\"]}");
	add("{\"term\":\"crappie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02565427\", \"07796462\"]}");
	add("{\"term\":\"craps\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00509963\", \"13765600\"]}");
	add("{\"term\":\"crapshoot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00510313\", \"00804446\"]}");
	add("{\"term\":\"crapshooter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09995554\"]}");
	add("{\"term\":\"crapulence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00749813\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }