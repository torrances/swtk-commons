package org.swtk.commons.dict.wordnet.index.name.instance.r.i.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRICH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08196373\"]}");
	add("{\"term\":\"richards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11280935\"]}");
	add("{\"term\":\"richardson\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11281174\", \"11281354\"]}");
	add("{\"term\":\"richea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12274995\"]}");
	add("{\"term\":\"richelieu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281473\"]}");
	add("{\"term\":\"riches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13374295\"]}");
	add("{\"term\":\"richler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281688\"]}");
	add("{\"term\":\"richmond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09172802\"]}");
	add("{\"term\":\"richmondena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01543902\"]}");
	add("{\"term\":\"richness\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04736586\", \"04965637\", \"05154833\", \"05171628\", \"04996251\", \"14515209\", \"05123104\"]}");
	add("{\"term\":\"richweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12415585\", \"12865169\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }