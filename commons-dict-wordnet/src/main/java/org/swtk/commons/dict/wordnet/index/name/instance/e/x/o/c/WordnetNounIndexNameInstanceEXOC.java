package org.swtk.commons.dict.wordnet.index.name.instance.e.x.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11704968\"]}");
	add("{\"term\":\"exocet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03309142\"]}");
	add("{\"term\":\"exocoetidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02552927\"]}");
	add("{\"term\":\"exocrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05336415\"]}");
	add("{\"term\":\"exocycloida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02322075\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }