package org.swtk.commons.dict.wiktionary.generated.g.o.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGOJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("goji", "{\"term\":\"goji\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"Marketing coinage, likely an altered pronunciation of the Mandarin chinese \u0027gǒuqǐ\u0027 ({{l|cmn|枸杞}}). The [http://books.google.com/books?id\u003dUSQvtP6lKLQC\u0026amp;q\u003dgoji+berries\u0026amp;dq\u003dgoji+berries\u0026amp;lr\u003d\u0026amp;as_drrb_is\u003db\u0026amp;as_minm_is\u003d1\u0026amp;as_miny_is\u003d1932\u0026amp;as_maxm_is\u003d12\u0026amp;as_maxy_is\u003d2000\u0026amp;as_brr\u003d0\u0026amp;as_pt\u003dALLTYPES\u0026amp;pgis\u003d1 earliest known usage] in print was in a 1996 publication by Stephen Arlin, Fouad Dini, and David Wolfe. The first usage in the LexisNexis database is in an August 21, 2002 newspaper article by John Griffin entitled \u0026quot;Uncooked food trend raises hopes, casts doubts\u0026quot;.\u0026lt;ref\u0026gt;\u0027San Antonio Express-News\u0027, p. 1F\u0026lt;/ref\u0026gt; Wider usage began in 2003 and 2004.\u0026lt;ref\u0026gt;[http://books.google.com/books?lr\u003d\u0026amp;as_brr\u003d0\u0026amp;as_pt\u003dALLTYPES\u0026amp;q\u003dgoji+berries\u0026amp;btnG\u003dSearch+Books\u0026amp;as_drrb_is\u003db\u0026amp;as_minm_is\u003d1\u0026amp;as_miny_is\u003d2003\u0026amp;as_maxm_is\u003d12\u0026amp;as_maxy_is\u003d2009 Google Books chronologically restricted search]\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The wolfberry, a fruit in the genus \u0027Lycium\u0027, especially in commercial products where it is promoted as a superfruit\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }