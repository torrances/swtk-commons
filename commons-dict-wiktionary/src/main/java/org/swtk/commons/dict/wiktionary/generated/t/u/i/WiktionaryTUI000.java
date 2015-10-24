package org.swtk.commons.dict.wiktionary.generated.t.u.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTUI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tuition", "{\"term\":\"tuition\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) from Latin \u0027tuitiō\u0027 (guard, protection, defense) from \u0027tueri\u0027 Compare \u0027\u0027 \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sum of money paid for instruction (such as in a high school, boarding school, university, or college\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The training or instruction provided by a teacher or tutor\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"issue\u003d6|page\u003d30|magazine\u003d|title\u003d[http://www.theguardian.com/education/2013/jul/01/education-michael-gove-finland-gcse Finland spreads word on passage\u003dImagine a country where children do nothing but play until they start compulsory schooling at age seven. Then, without exception, they attend comprehensives until the age of 16.There are no inspectors, no exams until the age of 18, no school league tables, no private \u0027\u0027tuition\u0027\u0027 industry, no school uniforms.\u0026amp;nbsp;[\u0026amp;hellip\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Care, guardianship\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1599\u0027\u0027, w:William William Shakespeare, w:Much Ado About Much Ado About Nothing, s:Much Ado About Nothing Act 1 Scene 1\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"BENEDICK. I have almost matter enough in me for such an embassage; and so I commit you\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"CLAUDIO. To the \u0027\u0027tuition\u0027\u0027 of God: from my house, if I had it\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"DON PEDRO. The sixth of July: your loving friend, Benedick\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"BENEDICK. Nay, mock not, mock not\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }