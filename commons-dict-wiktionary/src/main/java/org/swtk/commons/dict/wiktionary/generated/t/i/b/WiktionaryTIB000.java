package org.swtk.commons.dict.wiktionary.generated.t.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tiber", "{\"term\":\"tiber\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027tiberis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The river that flows through Rome in Italy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tiberius", "{\"term\":\"tiberius\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"etruscan\", \"Latin\"], \"text\":\"Latin \u0027tiberius\u0027 literally \u0027Of the Tiber\u0027, from \u0027tiberis\u0027 the river Tiber. Also note Faliscan equivalent \u0027\u0027*Tiferios\u0027\u0027. The name is mistaken by some to be of Etruscan origin but note the borrowed variants, \u0027Thefarie\u0027 (from Faliscan) and \u0027Teperi\u0027 (from Latin).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of mostly historical use, in particular, the praenomen of the second Roman emperor w:Tiberius Julius Caesar Tiberius Julius Caesar Augustus, reigning 14-37\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Now in the fifteenth year of the reign of \u0027\u0027Tiberius\u0027\u0027 Caesar, Pontius Pilate being governor of Judaea, and Herod being tetrarch of Galilee\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tibialis", "{\"term\":\"tibialis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|tībia|ālis|gloss1\u003dshin bone|lang\u003dla}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of two muscles that attach to the tibia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tibicen", "{\"term\":\"tibicen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From the Latin \u0027tībīcen\u0027 (piper”, “flautist)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A -player; a\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1776\u0027\u0027, \u0027A General History of Music\u0027 (1789), volume I, chapter x, page 173\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"When the Lacedaemonians went to battle a \u0027\u0027Tibicen\u0027\u0027 played soft and soothing music to temper their courage\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1891\u0027\u0027, Charles A. Ward, \u0027Oracles of \u0027, “[http://www.sacred-texts.com/nos/oon/oon19.htm Napoleonic Rule]”, page 251\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"But this man’s words are spirit itself, and burn their niche in Time, to last as long as that will. Take two of them: “Soldiers, forty centuries look down upon you!” and again, “Behold the sun of Austerlitz!” When you speak, speak thus to men; such words are deeds; and come not as from one who beateth the air to the pitchpipe of the \u0027\u0027tibicen\u0027\u0027 Ciceronical, but as the bullet to its butt; speak swordpoints, that press between the joints and marrow\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, Timothy J. Moore, \u0027Music in Roman Comedy\u0027, ISBN 9781107006485, [http://books.google.co.uk/books?id\u003dtzyVADDprSUC\u0026amp;pg\u003dPA14\u0026amp;dq\u003d%22tibicines%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d1H9pUur5MaPX0QWymIGAAQ\u0026amp;ved\u003d0CDMQ6AEwA\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22tibicines%22\u0026amp;f\u003dfalse page 14\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"We have no archaeological evidence that we can with certainty attribute to original performances of Plautus and Terence. We can, however, learn a great deal by examining Greek and later Roman evidence, including artistic portrayals of singers, \u0027\u0027\u0027tibicines\u0027\u0027\u0027, and theatrical performances, and some surviving \u0027tibiae\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }