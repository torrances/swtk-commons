package org.swtk.commons.dict.wordnet.index.name.instance.h.a.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHALO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"halo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11507824\", \"13898031\", \"04958893\"]}");
	add("{\"term\":\"haloalkane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14625824\"]}");
	add("{\"term\":\"halobacter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350873\"]}");
	add("{\"term\":\"halobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350873\"]}");
	add("{\"term\":\"halobacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350873\"]}");
	add("{\"term\":\"halocarbon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14928679\"]}");
	add("{\"term\":\"halocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11675858\"]}");
	add("{\"term\":\"haloform\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14645073\"]}");
	add("{\"term\":\"halogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14928812\"]}");
	add("{\"term\":\"halogeton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11854218\"]}");
	add("{\"term\":\"halon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14644435\"]}");
	add("{\"term\":\"haloperidol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03485269\"]}");
	add("{\"term\":\"halophil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350716\"]}");
	add("{\"term\":\"halophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350716\"]}");
	add("{\"term\":\"halophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12407620\"]}");
	add("{\"term\":\"haloragaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12347121\"]}");
	add("{\"term\":\"haloragidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12347121\"]}");
	add("{\"term\":\"halothane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03485450\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }