package org.swtk.commons.dict.wordnet.index.name.instance.b.a.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bast\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09535163\", \"13119721\", \"13120203\"]}");
	add("{\"term\":\"bastard\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02807938\", \"09862211\", \"09834593\"]}");
	add("{\"term\":\"bastardisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00273147\"]}");
	add("{\"term\":\"bastardization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00273147\", \"06739227\"]}");
	add("{\"term\":\"bastardy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13976433\"]}");
	add("{\"term\":\"baste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02808296\"]}");
	add("{\"term\":\"baster\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02808468\", \"09862436\", \"09862588\"]}");
	add("{\"term\":\"bastille\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02808628\", \"02808769\"]}");
	add("{\"term\":\"bastinado\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00423117\", \"02809030\"]}");
	add("{\"term\":\"basting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00248822\", \"02808296\"]}");
	add("{\"term\":\"bastion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02809168\", \"02809273\", \"08081208\"]}");
	add("{\"term\":\"bastnaesite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14692226\"]}");
	add("{\"term\":\"bastnasite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14692226\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }