package org.swtk.commons.dict.wordnet.index.name.instance.s.p.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spergula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11837469\"]}");
	add("{\"term\":\"spergularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11837798\"]}");
	add("{\"term\":\"sperm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05465045\"]}");
	add("{\"term\":\"spermaceti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15119956\"]}");
	add("{\"term\":\"spermatid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05466677\"]}");
	add("{\"term\":\"spermatocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05466435\"]}");
	add("{\"term\":\"spermatocide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04281515\"]}");
	add("{\"term\":\"spermatocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05466566\"]}");
	add("{\"term\":\"spermatogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13581532\"]}");
	add("{\"term\":\"spermatophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571662\"]}");
	add("{\"term\":\"spermatophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572837\"]}");
	add("{\"term\":\"spermatozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05465045\"]}");
	add("{\"term\":\"spermatozoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13116302\"]}");
	add("{\"term\":\"spermatozoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05465045\"]}");
	add("{\"term\":\"spermicide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04281515\"]}");
	add("{\"term\":\"spermophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02360743\"]}");
	add("{\"term\":\"spermophilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02360393\"]}");
	add("{\"term\":\"sperry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11331006\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }