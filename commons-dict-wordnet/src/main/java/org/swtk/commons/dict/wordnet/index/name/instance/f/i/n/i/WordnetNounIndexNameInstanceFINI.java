package org.swtk.commons.dict.wordnet.index.name.instance.f.i.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFINI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"finial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03347474\"]}");
	add("{\"term\":\"finis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00211646\", \"15292365\"]}");
	add("{\"term\":\"finish\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00211367\", \"05725694\", \"07306035\", \"07347762\", \"07367976\", \"08585406\", \"14483408\", \"15292365\", \"04707990\"]}");
	add("{\"term\":\"finisher\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02387654\", \"03347807\", \"09642622\", \"09642775\", \"09642904\", \"09949715\"]}");
	add("{\"term\":\"finishing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00211367\", \"04707990\"]}");
	add("{\"term\":\"finiteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216927\"]}");
	add("{\"term\":\"finitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216927\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }