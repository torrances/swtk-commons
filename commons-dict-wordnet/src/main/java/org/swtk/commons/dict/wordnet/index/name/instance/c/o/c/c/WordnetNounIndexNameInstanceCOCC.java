package org.swtk.commons.dict.wordnet.index.name.instance.c.o.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOCC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cocci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01353496\"]}");
	add("{\"term\":\"coccidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02251396\"]}");
	add("{\"term\":\"coccidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01425476\"]}");
	add("{\"term\":\"coccidioidomycosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14170496\"]}");
	add("{\"term\":\"coccidiomycosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14170496\"]}");
	add("{\"term\":\"coccidiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476756\"]}");
	add("{\"term\":\"coccidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01425943\"]}");
	add("{\"term\":\"coccinellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02167899\"]}");
	add("{\"term\":\"coccobacillus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01353635\"]}");
	add("{\"term\":\"coccoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02250799\"]}");
	add("{\"term\":\"coccothraustes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01543338\"]}");
	add("{\"term\":\"cocculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11734097\"]}");
	add("{\"term\":\"coccus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01353496\"]}");
	add("{\"term\":\"coccyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05281746\"]}");
	add("{\"term\":\"coccyzus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01826251\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }