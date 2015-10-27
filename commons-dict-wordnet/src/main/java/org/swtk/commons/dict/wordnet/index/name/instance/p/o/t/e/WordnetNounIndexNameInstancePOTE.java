package org.swtk.commons.dict.wordnet.index.name.instance.p.o.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07923582\"]}");
	add("{\"term\":\"potemkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11264051\"]}");
	add("{\"term\":\"potence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14075210\"]}");
	add("{\"term\":\"potency\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"14075210\", \"14506204\", \"05041380\", \"05203850\"]}");
	add("{\"term\":\"potentate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10031556\"]}");
	add("{\"term\":\"potential\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11514227\", \"14506204\"]}");
	add("{\"term\":\"potentiality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05630964\", \"14506204\"]}");
	add("{\"term\":\"potentiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13560625\"]}");
	add("{\"term\":\"potentilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12657466\"]}");
	add("{\"term\":\"potentiometer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03998004\", \"03998195\"]}");
	add("{\"term\":\"poterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12658080\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }